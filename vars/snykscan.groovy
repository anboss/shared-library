#!/usr/bin/env groovy

def snykscan() {
       stage('SnykScan'){
            steps{
                snykSecurity failOnError: false, failOnIssues: false, organisation: 'anboss', projectName: 'kjap-platform', snykInstallation: 'MySnyk', snykTokenId: 'abf17a73-719c-40d5-97b5-dffad3856df7'
            }
        }
}
