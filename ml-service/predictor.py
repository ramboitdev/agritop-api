import numpy as np

# Mock predictor - replace with real model serving
def predict(features: dict) -> dict:
    # simple heuristic: higher precipitation + moderate temp -> better yield
    temp = features.get('temperature', 25.0)
    precip = features.get('precipitation', 5.0)
    humidity = features.get('humidity', 50.0)

    score = (precip * 0.6) + (max(0, 30 - abs(25 - temp)) * 0.3) + (humidity * 0.1)
    predicted_yield = max(0.0, round(score * 0.8, 2))
    confidence = min(0.99, round(0.5 + (precip/20.0), 2))

    recommendation = "Normal"
    if precip < 2:
        recommendation = "Irrigation recommended"
    elif humidity > 80:
        recommendation = "Inspect for disease risk"

    return {
        "predicted_yield": predicted_yield,
        "confidence": confidence,
        "recommendation": recommendation
    }
