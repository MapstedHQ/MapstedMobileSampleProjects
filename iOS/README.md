# Mapsted Mobile SDK — iOS Samples

A set of focused iOS sample apps showing how to integrate indoor positioning,
mapping, and wayfinding with the **Mapsted Mobile SDK**.

📚 **Documentation:** [developer.mapsted.com/mobile-sdk](https://developer.mapsted.com/mobile-sdk/)
🚀 **Getting Started (iOS):** [developer.mapsted.com/mobile-sdk/getting-started/ios-getting-started](https://developer.mapsted.com/mobile-sdk/getting-started/ios-getting-started/)

## Samples

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

## How to run

```bash
cd Sample_with_Map/Sample
pod install
open Sample.xcworkspace
```

Then build and run from Xcode. The Mapsted SDK is delivered through CocoaPods
(SwiftPM is also supported). For dependencies, requirements, and troubleshooting,
follow the
[iOS Getting Started guide](https://developer.mapsted.com/mobile-sdk/getting-started/ios-getting-started/).

## Demo licence

A **demo licence file** is included with access to a sample venue —
**Square One Shopping Centre** (property `504`) — so the samples run out of the box.
To use your own venue, request a licence through [mapsted.com](https://mapsted.com/).
