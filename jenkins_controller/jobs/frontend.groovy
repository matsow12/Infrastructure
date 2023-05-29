pipelineJob('frontend') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/matsow12/Frontend')
          }
          branch('*/tests')
          scriptPath('Jenkinsfile')
        }
      }
      lightweight()
    }
  }
}