# Home Page with Grid Layout

This repository contains the source code for an Android application designed to create a home page using a grid layout. The project is structured to demonstrate the use of intents, buttons, and a grid layout to organize UI elements in a 2x3 matrix.

## Project Overview

The application consists of two main activities:

1. **MainActivity**: The entry point of the application, showcasing a grid layout with three buttons. Each button performs a different action:
   - **Implicit Intent Button**: Opens the developer's GitHub profile in a web browser.
   - **Explicit Intent Button**: Navigates to a second activity displaying a list of practical experiments.
   - **Toast Button**: Displays a toast message on the screen.

2. **SecondActivity**: Displays a list of practical experiments performed.

## Key Features

- **Grid Layout**: Utilizes a `GridLayout` to organize buttons in a 2x3 matrix, demonstrating the use of `layout_columnWeight` and `layout_rowWeight` to distribute space evenly.
- **Intents**: Demonstrates both implicit and explicit intents. The implicit intent opens a URL in a web browser, while the explicit intent navigates to `SecondActivity`.
- **Toast Messages**: Shows how to display a simple message to the user using a `Toast`.

## Project Structure

- **MainActivity.java**: The main activity of the application, handling button clicks and navigation.
- **activity_main.xml**: The layout file for `MainActivity`, defining the grid layout and buttons.
- **AndroidManifest.xml**: Declares the application's components and permissions.
- **SecondActivity.java**: The second activity, displaying a list of practical experiments.
- **activity_second.xml**: The layout file for `SecondActivity`, containing a `ConstraintLayout` with `TextView` elements.
- **button_border.xml**: A drawable resource defining the border for buttons.

## Screenshots

- **HOME GRID**: ![s1](https://github.com/AbulFaizBangi/Home_Grid/assets/140591784/123e0437-1541-4109-adda-cc7c46a13fec)

- **IMPLICIT INTENT**:![s2](https://github.com/AbulFaizBangi/Home_Grid/assets/140591784/78e94df7-df00-41de-b774-f9332b37dc42)

- **EXPLICIT INTENT**:  ![s5](https://github.com/AbulFaizBangi/Home_Grid/assets/140591784/177df449-8a2e-4f4d-bdd0-b068ae361d82) 

- **TOAST MESSAGE**:   ![s4](https://github.com/AbulFaizBangi/Home_Grid/assets/140591784/ad3d3b5f-fe68-4572-9ac9-867a51eff964)

- **CONCEPT FLOW DIAGRAM**: ![WhatsApp Image 2024-03-11 at 22 47 05](https://github.com/AbulFaizBangi/Home_Grid/assets/140591784/59b22953-870f-4b6d-adfd-fe31c0332c93)


