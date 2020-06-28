from selenium import webdriver
from selenium.webdriver.common.keys import Keys
d = webdriver.Chrome(executable_path='webdriver\chromedriver.exe')
d.get("http://google.com/")
print(d.title)
d.close()
