# Hubitat Bond Integration

A community-maintained Hubitat integration for the Bond Bridge.

This project is based on the excellent original work by **Dominick Meglio** and provides a small community enhancement for Hubitat Easy Dashboard while retaining the original Bond device drivers.

## Current Release

**Version 1.1.1**

### What's New

- Restored the original **BOND Motorized Shade** driver as the standard shade driver.
- Added a separately named optional **BOND Motorized Shade - EZ Dashboard** driver so both drivers can coexist in Hubitat.
- Clarified that the Community Edition app provides the synthetic `position` events used for Easy Dashboard compatibility.
- No change to Bond commands or normal shade operation.

## Background

The original Bond integration reports the `windowShade` state (`open` / `closed`) for motorized shades, but Bond does not provide true intermediate shade-position feedback for these RF shades.

Hubitat Easy Dashboard expects a `position` attribute for its **Window Shade** tile. The Community Edition app therefore publishes endpoint position values:

| Shade State | Position |
|-------------|---------:|
| Open | 100 |
| Closed | 0 |

These are synthetic endpoint values only. They do **not** represent actual intermediate blind position.

## Shade Drivers

Two Motorized Shade drivers may be installed together:

### BOND Motorized Shade

The original upstream shade driver by Dominick Meglio.

This remains the standard driver and is installed as a required component of the package.

### BOND Motorized Shade - EZ Dashboard

A separately named optional variant retained for users who want an explicitly identified Easy Dashboard shade driver.

It can coexist with the original driver and may be selected manually for individual shade devices.

Both drivers use the existing Bond parent integration commands for Open, Close and Stop.

> **Note:** Easy Dashboard position compatibility is supplied by the Community Edition parent app, not by a unique position-reporting implementation in the EZ-named driver.

## Features

- Ceiling Fans
- Fan Lights
- Motorized Shades
- Fireplaces
- Generic Bond Devices
- Multiple Bond Bridges
- Fireplace Fan and Light Components
- Easy Dashboard compatible endpoint position reporting
- Original and EZ-labelled Motorized Shade drivers can coexist

## Installation

### Manual installation

1. Install the required drivers from the **drivers** folder.
2. Install **BOND_Home_Integration.groovy** from the **apps** folder.
3. Optionally install **BOND_Motorized_Shade_EZ_Dashboard.groovy** if you want the separately named EZ Dashboard driver.
4. Add the Bond integration app in Hubitat.
5. Enter your Bond Bridge IP address and API Token.
6. Select the devices to import.
7. Save.

### HPM install from URL

This repository is not currently listed in the Hubitat Package Manager community repository.

It can still be installed using HPM's **Install from a URL** option with the raw URL to this repository's `packageManifest.json`.

The original **BOND Motorized Shade** driver is required. The separately named **BOND Motorized Shade - EZ Dashboard** driver is optional.

## Upgrading from 1.1.0

1. Restore or retain the original `BOND_Motorized_Shade.groovy` under its original driver name.
2. Add `BOND_Motorized_Shade_EZ_Dashboard.groovy` only if you want the separately named variant.
3. Update the Community Edition app and package manifest to Version 1.1.1.
4. Existing shade devices may be switched manually between the two installed shade drivers.

No Bond device re-pairing or re-import is required.

## Compatibility

Tested with:

- Hubitat Elevation
- Bond Bridge
- Bond Motorized Shades
- Hubitat Easy Dashboard
- Modern Dashboard (mDash)

## Credits

Original project:

**Dominick Meglio**

https://github.com/dcmeglio/hubitat-bond

Community enhancements:

**Neil McLaren**

## Licence

This project retains the original Apache 2.0 licence.

See the LICENSE file for details.

## Changelog

### Version 1.1.1

- Restored the original BOND Motorized Shade driver as the standard package driver.
- Added the separately named optional BOND Motorized Shade - EZ Dashboard driver.
- Clarified that synthetic 0/100 endpoint position events are supplied by the Community Edition app.
- Updated installation and upgrade guidance.

### Version 1.1.0

- Added `position` events (0/100) for Motorized Shades.
- Improved compatibility with Hubitat Easy Dashboard Window Shade tiles.
