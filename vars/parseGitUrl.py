import re

#extract project and namespace from project url
def extract_fields_from_repo_url(repository_url):
  matches = re.search(r'([a-z]+):\/\/([^/]*)\/([^/]*)\/(.*)\.git', repository_url)
  protocol = matches.group(1)
  domain = matches.group(2)
  name_space = matches.group(3)
  project = matches.group(4)

  return name_space, project

name_space, project = extract_fields_from_repo_url('https://gitlab.com/gitlab-org/gitlab-ce.git')

print (name_space)
print (project)
