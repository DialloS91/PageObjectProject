   pipeline {
       agent any

       stages {

        stage('Execution rights') {
            steps {
                sh 'chmod +x gradlew'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew clean test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }

     post {
            always {
                publishHTML([allowMissing: false, alwaysLinkToLastBuild: true, keepAll: false, reportDir: 'build/reports/tests/test/', reportFiles: 'index.html', reportName: 'Test Report', reportTitles: ''])
            }
        }
    }
