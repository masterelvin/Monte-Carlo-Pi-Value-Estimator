# Monte Carlo π Value Estimator

A visualization of the Monte Carlo method for estimating the value of π through random sampling.

## Overview

This project estimates π by generating random points inside a unit square and determining whether each point lies inside the quarter unit circle.

A point is inside the circle if

\[
x^2 + y^2 \leq 1
\]

Because the area of the quarter circle is \(\pi/4\) and the area of the square is 1, the ratio of points inside the circle to the total number of points approaches \(\pi/4\). Rearranging gives the estimator

\[
\pi \approx 4 \cdot \frac{\text{points inside}}{\text{total points}}
\]

As the number of samples increases, the estimate converges toward the true value of π.

## Features

- Random point generation
- Real-time visualization of sampled points
- Running estimate of π
- Adjustable sample size (if applicable)
- Demonstrates convergence through simulation

## Algorithm

1. Generate a random point \((x, y)\) where \(0 \leq x,y \leq 1\).
2. Test whether \(x^2 + y^2 \leq 1\).
3. Count points inside the quarter circle.
4. Compute

   ```
   π ≈ 4 × (inside / total)
   ```

5. Repeat for additional samples.

## Motivation

The Monte Carlo method is a probabilistic technique used to approximate numerical quantities through repeated random sampling. Although it is not the most efficient way to compute π, it is a simple demonstration of probability, geometry, and statistical convergence.

## Technologies

- HTML
- CSS
- JavaScript

## Repository Structure

```
.
├── index.html
├── style.css
├── script.js
└── social-preview.png
```

## Author

Elvin Pio
