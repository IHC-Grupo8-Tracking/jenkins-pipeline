def TCONST1 = 'top-const-1'

pipeline {
    agent any

    options {
        timestamps()
        withEnv(["OENV1=options-env-variable-1"])
    }

    environment {
        PENV1 = "pipeline-env-valiable-1 + ${OENV1} "
        PENV2 = sh (
            script: 'echo pipeline-env-valiable-2',
            returnStdout: true
        ).trim()
    }

    stages {
        
        stage('Build container'){
            steps {
                script {
                    app = docker.build("jenkins-pipeline-example:${env.BUILD_ID}")   
                }
            }
        }

        stage('Test Environment Variables') {

            environment {
                SENV1 = "stage-env-valiable-1 + ${OENV1}"
                SENV2 = sh (
                    script: 'echo stage-env-valiable-2',
                    returnStdout: true
                ).trim()
            }

            steps {
                echo "${TCONST1}"
                echo "${OENV1}"
                echo "${PENV1}"
                echo "${PENV2}"
                echo "${SENV1}"
                echo "${SENV2}"
            }
        }

        stage('Setup Gradle') {
            steps {
                sh './gradlew -v'
            }
        }

        stage('Compile') {
            steps {
                sh './gradlew clean testClasses'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
            post {
                always {
                    junit 'build/test-results/test/*.xml'
                }
            }
        }
        
        stage('Deployment') {
            steps {
               echo 'this will deploy de software'
                echo 'Perhaps deplying to kubernets'
                echo "build-number: ${env.BUILD_NUMBER}"
            }
        }
    }
}
