We'd like to be able to predict the results of a race, based on: the length of the track, the acceleration of the racers accel, and the top speed of the racers spd. Assume that the racers will accelerate constantly until they reach their respective top speeds, and then they will remain at that top speed until the end of the race.

Your goal is to return an array res, where res[i] is the place the ith racer will take in this competition (0-based). In the case of a tie, the racer with the lower pole position (index) wins.

Example

For track = 10, accel = [2, 2] and spd = [2, 4], the output should be
racers(track, accel, spd) = [1, 0].
There are two racers, Racer #0, and Racer #1. Both Racer #0 and Racer #1 can accelerate at 2m/s². Racer #0 has a top speed of 2m/s, and Racer #1 has a top speed of 4m/s. They race down a 10m track. Racer #1 will win this race, and Racer #0 will take second place. So, since the answer should be 0-based, we return [1, 0].

For track = 10, accel = [2, 2] and spd = [2, 2], the output should be
racers(track, accel, spd) = [0, 1].
There are two identical racers, Racer #0, and Racer #1. Both Racer #0 and Racer #1 can accelerate at 2m/s². Both Racer #0 and Racer #1 have a top speed of 2m/s. They race down a 10m track. The race would be a tie, so we give the win to Racer #0, who had the better pole position, while Racer #1 takes second place. So the answer is [0, 1].

Input/Output

[time limit] 3000ms (java)
[input] integer track

The length of the track in meters.

Guaranteed constraints:
1 ≤ track ≤ 5 · 106.

[input] array.integer accel

An array of integers representing the acceleration of the racers in meters per second squared (m/s²).

Guaranteed constraints:
1 ≤ accel.length ≤ 20,
1 ≤ accel[i] ≤ 20.

[input] array.integer spd

An array of integers representing the top speed of the racers in meters per second (m/s).

Guaranteed constraints:
spd.length = accel.length,
1 ≤ accel[i] ≤ 350.

[output] array.integer

An array of integers res, where res[i] is the place the ith racer will take in the competition.
