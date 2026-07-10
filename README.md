# Mapsted Mobile SDK — Sample Apps

Ready-to-run iOS and Android sample apps that show how to build indoor
positioning, mapping, and wayfinding experiences with the **Mapsted Mobile SDK**.

Each app is small, focused, and self-contained — clone it, open it, and run it
against the included demo venue to see a feature working in minutes.

📚 **Full documentation:** [developer.mapsted.com/mobile-sdk](https://developer.mapsted.com/mobile-sdk/)
🚀 **Start here:** [Getting Started guide](https://developer.mapsted.com/mobile-sdk/getting-started/)

---

## What's inside

### iOS (Swift)

| Sample | What it demonstrates |
|---|---|
| `Sample_with_Map` | Display an interactive indoor map |
| `Sample_with_MapUI` | Prebuilt map UI (search, floor selector, and more) |
| `Sample_with_Map_Routing` | Indoor wayfinding and turn-by-turn routing |
| `Sample_With_Map_UI_SDK_POISelection` | Selecting points of interest with the prebuilt UI |
| `Sample_With_Map_SDK_POISelections_and_CustomMarker` | POI selection with custom map markers |
| `Sample_with_AddCustomIcons` | Add your own icons and markers to the map |
| `Sample_with_Geofence` | Geofence triggers for entities, floors, buildings, and properties |
| `Sample_with_LocSimulation` | Simulate movement along a path for development and testing |
| `Sample_with_MapUI_LocationShare` | Share a live location on the map |
| `Sample_LocMarketing` | Location-based marketing notifications |
| `Sample_with_AppTemplate` | A complete, out-of-the-box app template |

### Android (Kotlin / Java)

| Sample | What it demonstrates |
|---|---|
| `SampleDemoAppTemplate` | A complete, out-of-the-box app template |
| `Sample_Kotlin_Compose` | Integrating the SDK with Jetpack Compose |
| `Sample_with_AddCustomIcons` | Add your own icons and markers to the map |
| `Sample_with_Geofence` | Geofence triggers for entities, floors, buildings, and properties |
| `Sample_with_Loc_Marketing` | Location-based marketing notifications |
| `Sample_with_Loc_Share` | Share a live location |

---

## Quick start

Full, step-by-step setup (dependencies, requirements, and troubleshooting) lives in the
[Getting Started guide](https://developer.mapsted.com/mobile-sdk/getting-started/).
The short version:

### iOS

```bash
cd iOS/Sample_with_Map/Sample
pod install
open Sample.xcworkspace
```

Then build and run from Xcode. The Mapsted SDK is delivered through
[CocoaPods](https://developer.mapsted.com/mobile-sdk/getting-started/ios-getting-started/)
(SwiftPM is also supported).

### Android

Open the sample you want in **Android Studio** and run it. The Mapsted SDK is
resolved automatically from the public Maven repository configured in each project —
see the
[Android Getting Started guide](https://developer.mapsted.com/mobile-sdk/getting-started/android-getting-started/).

---

## Demo licence

Each sample includes a **demo licence file** with access to a sample venue —
**Square One Shopping Centre** (property `504`) — so the apps run out of the box.

To build with your own venue, reach out through
[mapsted.com](https://mapsted.com/) to get a licence for your property, then drop it
into the sample in place of the demo licence.

---

## Learn more

- 📚 [Developer Documentation](https://developer.mapsted.com/mobile-sdk/)
- 🚀 [Getting Started](https://developer.mapsted.com/mobile-sdk/getting-started/)
- 🌐 [mapsted.com](https://mapsted.com/)

© Mapsted Corp. Provided as reference sample code for the Mapsted Mobile SDK.
