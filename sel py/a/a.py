from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time

#driver = webdriver.Chrome(executable_path="C:/Users/maruf/Desktop/prac/webdriver/chromedriver.exe")
driver = webdriver.Firefox(executable_path="C:/Users/maruf/Desktop/prac/webdriver/geckodriver.exe")

s = "http://login.yahoo.com/"
driver.get(s)
# print(driver.title)
# print(driver.current_url)
# print(driver.page_source)
driver.find_element_by_id('createacc').click()
time.sleep(5)
driver.close()
