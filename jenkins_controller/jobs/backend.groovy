pipelineJob('backend') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/matsow12/Backend')
          }
          branch('*/tests')
          scriptPath('Jenkinsfile')
        }
      }
      lightweight()
    }
  }
}