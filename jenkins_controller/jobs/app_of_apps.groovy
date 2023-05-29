pipelineJob('app_of_apps') {
    parameters {
        stringParam('backendDockerTag', '', 'Backend docker image tag')
        stringParam('frontendDockerTag', '', 'Frontend docker image tag')
    }

    definition {
        cpsScm {
        scm {
            git {
            remote {
                url('https://github.com/matsow12/App_of_apps')
            }
            branch('*/master')
            scriptPath('Jenkinsfile')
            }
        }
        lightweight()
        }
  }

}


    