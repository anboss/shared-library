#!/usr/bin/env groovy

def call(projectName, organisation) {
       echo "projectName - $projectName"
       echo "organisation - $organisation"
       //snykSecurity failOnError: false, failOnIssues: false, organisation: organisation, projectName: projectName, snykInstallation: 'MySnyk', snykTokenId: 'snyk-token'

       snyk code test
       
       snykSecurity (
              failOnError: false, 
              failOnIssues: false, 
              organisation: organisation, 
              projectName: projectName, 
              snykInstallation: 'MySnyk', 
              snykTokenId: 'snyk-token',
              additionalArguments: '--code -debug'   
       )
}
