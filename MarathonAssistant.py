# Marathon training assistant program

import math

# This function converts a number of minutes and seconds into seconds

def total_seconds(min, sec):
    return min * 60 + sec

# This function calculates a speed in miles per hour given
# a time (seconds) that it takes to run 1 mile

def speed(time):
    return 3600 / time

# Prompt user for pace and mileage

pace_minutes = int(input('Minutes per mile? '))
pace_seconds = int(input('Seconds per mile? '))
miles = int(input('Total miles? '))

# Calculate and print speed

mph = speed(total_seconds(pace_minutes, pace_seconds))
print('Your speed is', mph,  'miles per hour')

# Calculate elapsed time for planned workout.

total = miles * total_seconds(pace_minutes, pace_seconds)
elapsed_minutes = total // 60
elapsed_seconds = total % 60

