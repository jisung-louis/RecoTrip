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

## 📱 주요 화면 (Activity) 구성

| Activity 파일명 | 용도 설명 |
|------------------|-----------|
| `MainActivity.kt` | 앱 실행 시 시작 지점. 로그인 상태에 따라 홈 또는 로그인으로 이동 예정 |
| `HomeActivity.kt` | 메인 홈 화면. 플랜 생성, 게시판, 설정 등 주요 기능으로 연결되는 허브 |
| `PlanActivity.kt` | 여행 플랜 생성 흐름의 메인 화면. 키워드 입력부터 동선 추천까지 처리 |
| `MyPlanActivity.kt` | 사용자가 저장한 여행 플랜 목록을 확인하는 화면 |
| `BoardActivity.kt` | 커뮤니티 게시판. 여행 후기나 질문 등 자유로운 소통 공간 |
| `SettingsActivity.kt` | 알림 설정, 로그아웃, 사용자 정보 등 설정 관련 기능 제공 |
| `LoginActivity.kt` | 사용자 로그인 화면. Firebase Auth와 연동 예정 |
| `SplashActivity.kt` | 앱 로딩 시 잠깐 보여지는 스플래시 화면. 자동 로그인 여부 처리 |
| `DetailActivity.kt` | 게시글, 관광지, 여행 플랜 등 상세정보를 보여주는 화면 |
| `NotificationActivity.kt` | 댓글, 공지, 시스템 알림 등을 표시하는 알림 화면 |

---

## 🗂️ 디렉토리 구조 (기능 기반)

```
java/com/f4/recotrip/
├── ui/                             ← 사용자 화면
│   ├── home/                       ← 홈 화면
│   │   └── HomeActivity.kt
│
│   ├── plan/                       ← 플랜 생성 관련 화면
│   │   ├── PlanActivity.kt
│   │   ├── MyPlanActivity.kt
│   │   ├── PlanViewModel.kt
│   │   └── fragment/
│   │       ├── KeywordFragment.kt
│   │       └── CityFragment.kt
│
│   ├── board/                      ← 커뮤니티 게시판
│   │   └── BoardActivity.kt
│
│   ├── settings/                   ← 설정 화면
│   │   └── SettingsActivity.kt
│
│   ├── auth/                       ← 로그인 관련
│   │   └── LoginActivity.kt
│
│   ├── splash/                     ← 앱 로딩 초기화면
│   │   └── SplashActivity.kt
│
│   ├── detail/                     ← 상세 정보 보기
│   │   └── DetailActivity.kt
│
│   └── notification/              ← 알림 보기
│       └── NotificationActivity.kt
│
├── model/                          ← 데이터 모델 클래스
├── adapter/                        ← RecyclerView 어댑터 등
├── repository/                     ← 데이터 처리/통신 등
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
| Kotlin | 2.1.0 |
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
