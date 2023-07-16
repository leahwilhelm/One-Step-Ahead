get prediction


%% One Step Ahead Prediction

% Define the step size and initial values
step_size = 0.1;
initial_value = 0;

% Allocate the Variables
data = zeros(1, 2000);
prediction = zeros(1, 2000);

% Set the initial value
data(1) = initial_value;

% Loop through the data and calculate the one step ahead predictions
for i = 1:2000
    % Calculate the current values
    if i == 1
        data(i) = initial_value;
    else
        data(i) = data(i-1) + step_size;
    end
    
    % Calculate the one step ahead prediction
    if i < 2000
		prediction(i) = data(i+1);
    end
end

% Plot the data and one step ahead predictions
plot(data,'b');
hold on;
plot(prediction,'r');
xlabel('Data Points');
ylabel('Values');
title('One Step Ahead Prediction');
legend('Data','Prediction');