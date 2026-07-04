# Hubitat Bond Integration

A community-maintained Hubitat integration for the Bond Bridge.

This project is based on the excellent original work by **Dominick Meglio** and provides ongoing community enhancements while maintaining compatibility with the original functionality.

## Current Release

**Version 1.1.0**

### What's New

- Added support for the `position` attribute (0 or 100) on Motorized Shades.
- Enables full compatibility with the Hubitat Easy Dashboard **Window Shade** tile.
- No changes to existing automations or supported Bond devices.

## Background

The original Bond Integration reports only the `windowShade` attribute (`open` / `closed`) for motorized shades.

Hubitat Easy Dashboard requires a `position` attribute for its Window Shade tile to display and operate correctly.

This release automatically publishes:

| Shade State | Position |
|-------------|---------:|
| Open | 100 |
| Closed | 0 |

Since Bond Bridge does not report actual shade position, this provides the best available compatibility for binary open/close shades.

## Features

- Ceiling Fans
- Fan Lights
- Motorized Shades
- Fireplaces
- Generic Bond Devices
- Multiple Bond Bridges
- Fireplace Fan and Light Components
- Easy Dashboard compatible Motorized Shades

## Installation

1. Install all drivers from the **drivers** folder.
2. Install **BOND_Home_Integration.groovy** from the **apps** folder.
3. Add the app in Hubitat.
4. Enter your Bond Bridge IP address and API Token.
5. Select the devices to import.
6. Save.

## Upgrading

Existing users can simply replace the **BOND Home Integration** app with Version 1.1.0.

No driver changes are required.

## Compatibility

Tested with:

- Hubitat Elevation
- Bond Bridge
- Bond Motorized Shades
- Hubitat Easy Dashboard

## Credits

Original project:

Dominick Meglio

https://github.com/dcmeglio/hubitat-bond

Community enhancements:

Neil McLaren

## Licence

This project retains the original Apache 2.0 licence.

See the LICENSE file for details.

## Changelog

### Version 1.1.0

- Added `position` events (0/100) for Motorized Shades.
- Improved compatibility with Hubitat Easy Dashboard Window Shade tiles.
