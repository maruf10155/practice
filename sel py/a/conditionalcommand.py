from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time

driver = webdriver.Chrome(executable_path="C:/Users/maruf/Desktop/prac/webdriver/chromedriver.exe")
# driver = webdriver.Firefox(executable_path="C:/Users/maruf/Desktop/prac/webdriver/geckodriver.exe")

s = "http://google.com/"
driver.get(s)
ele=driver.find_element_by_name("q")
print(ele.is_displayed())
print(ele.is_enabled())
ele.send_keys("facebook")
ele.send_keys(Keys.ENTER)
# driver.close()