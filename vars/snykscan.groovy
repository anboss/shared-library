#!/usr/bin/env groovy

def call(projectName, organisation) {
       snykSecurity failOnError: false, failOnIssues: false, organisation: '${organisation}', projectName: '${projectName}', snykInstallation: 'MySnyk', snykTokenId: 'abf17a73-719c-40d5-97b5-dffad3856df7'
}
