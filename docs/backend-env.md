# ✅ Node.js 백엔드 개발환경

RecoTrip의 AI 추천 기능은 Node.js 기반 백엔드 서버에서 GPT API, Google API, OpenWeather API와 연동하여 제공합니다.  
또한 Firebase Authentication과 Firestore를 통해 인증 및 사용자 데이터 저장을 지원합니다.

---

## 🔧 개발 환경 정보

| 항목              | 설정 값 / 버전 추천           |
|-------------------|-------------------------------|
| Node.js           | 18.x LTS 이상 권장            |
| 패키지 관리자      | npm                           |
| 주요 프레임워크     | Express.js                    |
| 기타 사용 기술      | dotenv, axios, cors, firebase-admin |
| 데이터 저장소       | Firebase Firestore            |
| 인증 방식           | Firebase Authentication       |

---

## 📁 폴더 구조
```
recotrip-backend/
├── index.js              # 서버 진입점
├── .env                  # 환경 변수 설정 파일
├── package.json          # 프로젝트 설정 및 의존성
│
├── routes/               # API 라우터
│   ├── recommendRoutes.js    # GPT 추천 관련 라우터
│   ├── placeRoutes.js        # 관광지 정보 라우터
│   ├── weatherRoutes.js      # 날씨 정보 라우터
│   └── hotelRoutes.js        # 호텔 정보 라우터
│
├── controllers/          # API 요청 처리 로직
│   ├── recommendController.js
│   ├── placeController.js
│   ├── weatherController.js
│   └── hotelController.js
│
├── services/             # 외부 API 연동 서비스
│   ├── gptService.js         # GPT API 연동
│   ├── googleService.js      # Google Places API 연동
│   ├── weatherService.js     # OpenWeather API 연동
│   └── hotelService.js       # Google Places 기반 호텔 정보 처리
│
├── middlewares/          # 에러 핸들링, 인증 등
│   └── errorHandler.js
│
├── utils/                # 유틸 함수
│   └── formatHelper.js
│
└── docs/                 # 명세서, 샘플 응답 등 문서
└── api-doc.md
```
---

## 🌱 프로젝트 실행 방법

```bash
# 1. 저장소 클론
git clone https://github.com/RecoTrip/RecoTrip.git
cd recotrip-backend

# 2. 의존성 설치
npm install

# 3. 환경 변수 설정
cp .env.example .env
# 그리고 .env 파일에 실제 키를 채워주세요 (예: OPENAI_API_KEY, FIREBASE_API_KEY 등)

# 4. 서버 실행
npm run dev
# 또는
node index.js
```

---

## ✨ 기타 사항

- 모든 API는 `Content-Type: application/json`을 기준으로 동작합니다.
- `api-doc.md` 파일에서 각 API의 엔드포인트, 요청/응답 예시 등을 상세히 확인할 수 있습니다.
- GPT 기반 도시 및 여행 일정 추천은 OpenAI의 GPT API를 활용합니다.
- 관광지 및 호텔 정보는 Google Places API를 통해 제공됩니다.
- 날씨 정보는 OpenWeather API를 통해 특정 도시의 날씨를 조회합니다.
- Firebase Authentication을 통해 사용자 인증(회원가입, 로그인)을 처리합니다.
- 사용자 데이터는 Firebase Firestore에 저장되며, 향후 북마크 기능 등 확장 가능성을 고려한 구조로 설계됩니다.
- 프로젝트는 `Node.js + Express` 기반이며, API 중심의 백엔드 서버입니다.
---

문의 또는 협업 관련 내용은 팀원 문서 또는 Notion에서 확인해주세요.
