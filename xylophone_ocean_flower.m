prediction

function [prediction] = oneStepAhead(inputData)
%One Step Ahead prediction using inputData

% defines the number of samples in the input data
N = length(inputData);

% Initializes a vector for storing the one-step prediction results
prediction = zeros(N,1);

for n=1:(N-1)
    
    % Fit an autoregressive (AR) model of order 1 
    ARModel1 = ar(inputData(1:n),1);
    
    % Compute AR model output
    prediction(n+1) = predict(ARModel1, inputData(1:n), 1);
    
end

% Handle special case for N=1
if N ==1
    prediction(1) = inputData(1);
end

end