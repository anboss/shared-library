#!/usr/bin/env groovy

def call(projectName, organisation) {
       echo "projectName - $projectName"
       echo "organisation - $organisation"
	
       //snykSecurity failOnError: false, failOnIssues: false, organisation: organisation, projectName: projectName, snykInstallation: 'MySnyk', snykTokenId: 'snyk-token'

      script {
	sh '/c/Gradle/bin/snyk auth 307deaee-8220-489f-a4c3-c683be0d0de7'
       	sh '/c/Gradle/bin/snyk test'
      }
       
       // snykSecurity (
       //        failOnError: false, 
       //        failOnIssues: false, 
       //        organisation: organisation, 
       //        projectName: projectName, 
       //        snykInstallation: 'MySnyk', 
       //        snykTokenId: 'snyk-token',
       //        additionalArguments: '--code'   
       // )
}
