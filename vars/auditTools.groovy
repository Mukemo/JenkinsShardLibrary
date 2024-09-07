def call(Map config){
    node {
        echo "${config.message}"
        sh '''
            git version
            java -version
            mvn -version
            echo 'list'
            ls
            echo 'present working directory'
            pwd
        '''
    }
}