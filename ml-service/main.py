from fastapi import FastAPI
from pydantic import BaseModel
from predictor import predict

app = FastAPI(title="Agrisens ML Service")

class PredictRequest(BaseModel):
    parcel_id: int | None = None
    temperature: float
    precipitation: float
    humidity: float
    crop: str | None = None

class PredictResponse(BaseModel):
    predicted_yield: float
    confidence: float
    recommendation: str

@app.get('/health')
def health():
    return {"status": "ok"}

@app.post('/predict', response_model=PredictResponse)
def predict_endpoint(req: PredictRequest):
    result = predict(req.dict())
    return PredictResponse(**result)
