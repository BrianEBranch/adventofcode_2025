### Initial approach was to check if if a rotation would bring us > 100 or < 0.
### If > 100:
### dialPos =  (dialPos + rotation) - 100
### else :
###   dialPos = 100 + (dialPos - rotation);

### this is correct intuition but doesnt consider cases where our rotation is >> 100.
### i.e.) 300, 1000, ....
### so, modulo arithmetic to reduce to basic rotations
### -> 3123 % 100 = 23 which is much easier to work with than 3123.

### this results in correct approach if we modulo intial rotation :D