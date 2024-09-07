def call(){
    node {
        sh '''
            git version
            java -version
            mvn version
            echo 'list'
            ls
            echo 'present working directory'
            pwd
        '''
    }
}