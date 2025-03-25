# ✅ Node.js 백엔드 개발환경

RecoTrip의 AI 추천 기능은 Node.js 기반 백엔드 서버에서 GPT API, Google API와 연동하여 제공합니다.

---

## 🔧 개발 환경 정보

| 항목            | 설정 값 / 버전 추천 |
|-----------------|----------------------|
| Node.js         | 18.x LTS 이상 권장   |
| 패키지 관리자    | npm 또는 yarn (npm 기준) |
| 주요 프레임워크   | Express.js           |
| 기타 사용 기술    | dotenv, axios, cors 등 |
| 데이터 저장소     | Firebase Firestore 또는 MongoDB (선택에 따라) |
| 인증 방식         | Firebase Authentication 연동 예정 |

---

## 📁 폴더 구조 예시
```
backend/
├── src/
│   ├── routes/          # API 라우트
│   ├── controllers/     # 요청 처리 로직
│   ├── services/        # GPT, Google API 연동 로직
│   ├── config/          # 환경 변수, 설정
│   └── index.js         # 서버 진입점
├── .env.example         # 환경 변수 예시
├── package.json         # 의존성 및 스크립트
└── README.md            # 백엔드 설명 문서
```
---

## 🌱 프로젝트 실행 방법

```bash
# 1. 저장소 클론
git clone https://github.com/RecoTrip/RecoTrip.git
cd backend

# 2. 의존성 설치
npm install

# 3. 환경 변수 설정
cp .env.example .env
# 그리고 .env 파일에 실제 키를 채워주세요

# 4. 서버 실행
npm run dev
# 또는
node src/index.js

