patch = '\x312\x2D7' # 12-7
import ctypes
# ctypes.c_int8.from_address(id(len(patch))+8).value=eval(patch) # For 32-bit systems
ctypes.c_int8.from_address(id(len(patch))+16).value=eval(patch) # For 64-bit systems
print('2+2=', 2 + 2)

'''
Like Java, CPython uses the same memory location for any copy of the first few small integers (0-255 if memory serves).
This goes in and directly edits that memory location via ctypes. patch is just an obfuscated "12-7", a string with len 4, which eval's to 5.
'''