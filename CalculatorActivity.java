package com.example.portfolioapp;
        tvDisplay.setText(currentInput);
    }

    // Handle operator clicks
    public void onOperatorClick(View view) {
        Button btn = (Button) view;

        if (!currentInput.isEmpty()) {
            firstNumber = Double.parseDouble(currentInput);
            operator = btn.getText().toString();
            currentInput = "";
        }
    }

    // Handle equal click
    public void onEqualClick(View view) {
        if (!currentInput.isEmpty()) {
            double secondNumber = Double.parseDouble(currentInput);
            double result = 0;

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber != 0) {
                        result = firstNumber / secondNumber;
                    } else {
                        tvDisplay.setText("Error");
                        return;
                    }
                    break;
            }

            tvDisplay.setText(String.valueOf(result));
            currentInput = String.valueOf(result);
        }
    }

    // Handle clear button
    public void onClearClick(View view) {
        currentInput = "";
        firstNumber = 0;
        operator = "";
        tvDisplay.setText("0");
    }
}
