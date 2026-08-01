# Monte Carlo π Value Estimator

A visualization of the Monte Carlo method for estimating the value of π through random sampling.

## Overview

This project estimates π by generating random points inside a unit square and determining whether each point lies inside a quarter of a unit circle.

A point is inside the circle when:

$$
x^2 + y^2 \leq 1
$$

The area of the quarter circle is $\pi/4$, while the area of the square is 1. Therefore, the ratio of points inside the circle to the total number of points approaches $\pi/4$ as more samples are generated.

Rearranging gives the estimator:

$$
\pi \approx 4 \times \frac{\text{points inside circle}}{\text{total points}}
$$

As the number of random samples increases, the estimate converges closer to the actual value of π.

## How to Run

Download and run:

- `MonteCarloPi-1.0.exe` (Windows)
- `MonteCarloPi.jar` (Java)

The program will launch the Monte Carlo π simulation visualization.


## Features

- Random point generation
- Real-time visualization of sampled points
- Live estimation of π
- Adjustable number of samples
- Demonstrates statistical convergence through simulation

## Algorithm

1. Generate a random point $(x, y)$ where:

$$
0 \leq x,y \leq 1
$$

2. Check whether the point lies inside the quarter circle:

$$
x^2 + y^2 \leq 1
$$

3. Count the number of points inside the circle.
4. Calculate the estimated value of π:

$$
\pi \approx 4 \times \frac{\text{inside points}}{\text{total points}}
$$

5. Repeat the process with additional samples to improve accuracy.

## Motivation

The Monte Carlo method is a probabilistic technique that uses repeated random sampling to approximate numerical values. While it is not an efficient method for calculating π, it provides an intuitive demonstration of probability, geometry, and statistical convergence.

## Built With

- Java (JDK 25)
- Java Swing — for the GUI window, drawing panel, buttons, and input dialogs

## Repository Structure

```text
.
├── index.html
├── style.css
├── script.js
└── social-preview.png
