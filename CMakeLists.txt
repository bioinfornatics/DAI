cmake_minimum_required(VERSION 3.0)
find_package(Java COMPONENTS Development)
include(UseJava)

enable_testing()
project(DAI)

enable_testing()

set( SPRING_BUILD_DIR              "" CACHE PATH "Path to spring build directory"           )

set( cwd                            "${CMAKE_CURRENT_SOURCE_DIR}"                           )
set( AIName                         "SkirmishAI"                                           )
set( SRC_DIR                        "${cwd}/src"                                            )
set( LIB_DIR                        "${cwd}/libs"                                           )

set( MAJOR_VERSION                  0                                                       )
set( MINOR_VERSION                  1                                                       )
set( PATCH_VERSION                  0                                                       )
set( VERSION                        "${MAJOR_VERSION}.${MINOR_VERSION}.${PATCH_VERSION}"    )

set( CMAKE_JAVA_COMPILE_FLAGS       "-source" "1.8" "-target" "1.8" )

set( DAI_JAR_NAME                   "${AIName}-${VERSION}.jar"                              )
set( DAI_JAR_FILE                   "${CMAKE_JAVA_TARGET_OUTPUT_DIR}/${DAI_JAR_NAME}"       )
set( DAI_MANIFEST                   "${CMAKE_CURRENT_BINARY_DIR}/META-INF/MANIFEST.MF"      )

set( DataDir                        "${SKIRMISH_AI_DATA}/${AIName}/${VERSION}")
configure_file("manifest.extras.in" "${DAI_MANIFEST}" @ONLY                                 )

FILE( GLOB_RECURSE JAVA_SRC_FILES   "${SRC_DIR}/main/java/*.java"                           )
FILE( GLOB_RECURSE JAVA_TEST_FILES  "${SRC_DIR}/test/java/*.java"                           )


# Check if the user wants to compile the AI
if    (BUILD_Java_AIINTERFACE AND NOT AIName MATCHES "${AI_EXCLUDE_REGEX}")
    set(BUILD_THIS_SKIRMISHAI TRUE)
else  (BUILD_Java_AIINTERFACE AND NOT AIName MATCHES "${AI_EXCLUDE_REGEX}")
    set(BUILD_THIS_SKIRMISHAI FALSE)
    message("warning: ${AIName} Skirmish AI will not be built!")
endif (BUILD_Java_AIINTERFACE AND NOT AIName MATCHES "${AI_EXCLUDE_REGEX}")

# Compile and install
if    (BUILD_THIS_SKIRMISHAI)

    SkirmishAIMessage(STATUS "Found Skirmish AI: DAI ${VERSION}")


    set( CMAKE_JAVA_INCLUDE_PATH "${CLASSPATH_Java_AIINTERFACE}:${JavaOO_AIWRAPPER_JAR_CLASSPATH}" )

    file( GLOB jarFiles "${LIB_DIR}/*.jar" )
    foreach( jarFile ${jarFiles} )
        set( CMAKE_JAVA_INCLUDE_PATH "${CMAKE_JAVA_INCLUDE_PATH}:${jarFile}" )
    endforeach()

    # Assemble project generated libraries we depend on
    set(dependingTargets  "${Java_AIINTERFACE_TARGET}"  "${JavaOO_AIWRAPPER_TARGET}")
    set(dependingLibFiles "${Java_AIINTERFACE_JAR_BIN}" "${JavaOO_AIWRAPPER_JAR_BIN}")
    set_source_files_properties(${dependingLibFiles} PROPERTIES GENERATED TRUE)

    add_jar( ${AIName} ${JAVA_SRC_FILES} ${JAVA_TEST_FILES} VERSION ${VERSION} MANIFEST ${DAI_MANIFEST} )
    add_dependencies( ${AIName} ${dependingTargets} )
    #get_target_property(_jarFile ${AIName} JAR_FILE)
    #get_target_property(_classDir ${AIName} CLASSDIR)
    #SkirmishAIMessage(STATUS "Jar file ${_jarFile}")
    #SkirmishAIMessage(STATUS "Class compiled to ${_classDir}")
    #add_test(NAME TestDAI COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} ${AIName})
endif (BUILD_THIS_SKIRMISHAI)
