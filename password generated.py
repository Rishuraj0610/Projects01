import random
import string


# Prompt the user to desired length of password 
pass_length = int(input("Enter the desired length of the password: "))
all_char = string.ascii_letters + string.digits + string.punctuation

password = ''.join(random.choice(all_char) 
    for _ in range(pass_length))

# Display the Generated password
print("Generated Password: ", password)