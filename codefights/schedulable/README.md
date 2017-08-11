In computer science, rate-monotonic scheduling (RMS) is a priority assignment algorithm used in real-time operating systems. Given a set of tasks, your job is to determine whether they are schedulable by checking the Liu-Layland system utilization condition.

Liu & Layland proved that for a set of periodic tasks with unique periods, there exists a feasible schedule that will always meet deadlines if the CPU utilization is below a specific bound which depends on the number of tasks. The schedulability test they came up with is as follows:

where Ci and Ti are the computation time and period of the ith task, respectively.

For the given tasks, return true if they satisfy the Liu-Layland condition and false otherwise.

Example

For tasks = [[1, 2], [3, 4]], the output should be
schedulable(tasks) = false.

1 / 2 + 3 / 4 = 1.25 > 0.8284..., meaning the answer is false.

Input/Output

[time limit] 3000ms (java)
[input] array.array.integer tasks

An array of tasks with distinct periods, with each task given in the format [C, T], with C and T standing for the task's computation time and its period, respectively.

Constraints:
2 ≤ tasks.length ≤ 100,
tasks[i].length = 2,
1 ≤ tasks[i][0] < tasks[i][1] ≤ 100.

[output] boolean

Return true if the given set of tasks satisfies the Liu-Layland condition, otherwise return false.
