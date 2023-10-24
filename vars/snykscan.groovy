#!/usr/bin/env groovy

def call(projectName, organisation) {
       snykSecurity failOnError: false, failOnIssues: false, organisation: '${organisation}', projectName: '${projectName}', snykInstallation: 'MySnyk', snykTokenId: 'snyk-token'
}
