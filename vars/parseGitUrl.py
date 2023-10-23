import re, sys

#extract project and namespace from project url
def extract(repository_url):
  matches = re.search(r'([a-z]+):\/\/([^/]*)\/([^/]*)\/(.*)\.git', repository_url)
  protocol = matches.group(1)
  domain = matches.group(2)
  name_space = matches.group(3)
  project = matches.group(4)
  print(name_space)
  sys.exit(name_space)