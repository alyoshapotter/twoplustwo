#!/usr/bin/env bash
v=2                     #v is 2
v+=2                    #v is 4
v=$(($v*5))             #v is 20
v=$(($v-16))            #v is 4
v=$(bc<<<"sqrt($v)+2")  #v is 4 (sqrt(4) is 2)
v=$(bc<<<"$v/4+3")      #v is 4 (4/4 = 1)
echo '2+2=' $v          #So v is 4...?

# The second line concatenates v and 2 instead of adding them, to make 22.
# Actual explanation:

#    v=2                     #v is 2
#    v+=2                    #v is 22
#    v=$(($v*5))             #v is 110
#    v=$(($v-16))            #v is 94
#    v=$(bc<<<"sqrt($v)+2")  #v is 11 (by default, bc rounds to integers)
#    v=$(bc<<<"$v/4+3")      #v is 5 (11/4 is 2 with rounding)
#    echo '2+2=' $v          #TADAAAM