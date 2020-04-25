from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time

driver = webdriver.Chrome(executable_path="C:/Users/maruf/Desktop/prac/webdriver/chromedriver.exe")
# driver = webdriver.Firefox(executable_path="C:/Users/maruf/Desktop/prac/webdriver/geckodriver.exe")

s = "http://login.facebook.com/"
driver.get(s)
time.sleep(5)
driver.maximize_window()
print(driver.title)
# print(driver.current_url)
# print(driver.page_source)
#driver.find_element_by_xpath('//*[@id="u_0_b"]').click()
driver.get("http://google.com/")
time.sleep(5)
driver.get("http://yahoo.com")
driver.back()
time.sleep(5)
driver.forward()
time.sleep(5)
driver.forward()
time.sleep(5)
driver.quit()
