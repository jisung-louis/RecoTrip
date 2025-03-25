# RecoTrip ✈️

AI 기반 여행지 추천 & 경로 최적화 앱 (졸업 프로젝트)

---

## 🔧 기술 스택
- Android (Kotlin, XML 기반 UI)
- Firebase Auth, Firestore
- Node.js + GPT API 연동
- Google Places API, OpenWeather API

---

## 👨‍💻 팀원 역할
- 전지성: 팀장, 기획/일정/로그인 개발
- 김민수: 백엔드, GPT 연동, API 설계
- 송진우: 프론트엔드, 커뮤니티 기능
- 임다빈: 프론트엔드/디자인, 플랜/설정화면

---

## 🌱 브랜치 전략
- `main`: 최종 안정 버전
- `develop`: 중간 통합 버전
- `feat/*`: 기능 개발용 (ex. feat/plan-ui, feat/login, feat/board-api 등)

---

## 🗂️ 디렉토리 구조 (기능 기반)
```
java/com/f4/recotrip/
├── ui/
│   ├── home/
│   ├── plan/
│   │   ├── fragment/
│   │   └── PlanViewModel.kt
│   ├── board/
│   └── settings/
├── model/
├── adapter/
├── repository/
```
---

## 🎨 Layout 파일 네이밍 규칙

모든 XML 레이아웃 파일은 기능과 역할이 명확히 드러나도록 다음 형식으로 작성합니다:
```
[기능 or 화면 이름][역할][부가사항].xml
```
예시:
- `plan_activity_main.xml`: 플랜 생성용 메인 액티비티
- `plan_fragment_keyword.xml`: 키워드 입력 프래그먼트
- `board_activity_main.xml`: 커뮤니티 메인 화면

---

## ⚙️ 개발 환경

| 항목 | 버전 |
|------|------|
| Kotlin | 1.9.0 |
| Gradle | 8.7 |
| Android Gradle Plugin (AGP) | 8.6.1 |
| compileSdk | 35 |
| targetSdk | 35 |
| minSdk | 24 |

라이브러리 버전은 `libs.versions.toml`로 통일 관리 중입니다.

---

## 📁 기타 디렉토리

- `docs/`: 기획서, 설문지 결과, 발표자료 등 문서 저장
- `.github/`: PR 템플릿, 워크플로우 등 GitHub 관련 설정

---

## ✅ 협업 전 확인 사항

- [x] 디렉토리 구조 및 레이아웃 네이밍 통일
- [x] 빌드 오류 없이 실행 가능
- [x] 공통 ViewModel 구조 도입
- [x] 기능별 브랜치에서 작업 예정

---
