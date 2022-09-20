

import random

lower = "abcdefghijklmnopqrstuvwxyz"
upper = "ABCDEDFGHIJKLMNOPQRSTUVWXYZ"
numbers = "0123456789"
symbols = "!@#$%^&*()."

mix_str = lower + upper + numbers + symbols
password = "".join(random.sample(mix_str , 10))
                

print("password:" + password)
