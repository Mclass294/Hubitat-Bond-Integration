/**
 *  BOND Motorized Shade - EZ Dashboard
 *
 *  Modified variant for Hubitat EZ Dashboard compatibility.
 *  Retains the original Bond Home shade behaviour while distinguishing
 *  this driver from the upstream BOND Motorized Shade driver.
 *
 *  Copyright 2019-2020 Dominick Meglio
 *
 */

metadata {
    definition (
		name: "BOND Motorized Shade - EZ Dashboard", 
		namespace: "bond", 
		author: "dmeglio@gmail.com / mclass",
	) {
        capability "WindowShade"
		capability "Switch"
		
        command "stop"
        command "fixShade", [[name:"Shade*", type: "ENUM", description: "Shade", constraints: ["open","close"] ] ]
		command "toggle"
		
    }
}

def open() {
	parent.handleOpen(device)
}

def close() {
	parent.handleClose(device)
}

def on() {
	open()
}

def off() {
	close()
}

def toggle() {
	if (device.currentValue("windowShade") == "open")
		close()
	else
		open()
}

def stop() {
	parent.handleStop(device)
}

def fixShade(shade) {
	parent.fixShadeState(device, shade)
}

def setPosition(Number position) {
    if (position == 0) {
        log.info "position special value 0 is set, trigger CLose command"
        close()
    } else if (position == 50) {
        log.info "position special value 50 is set, triggering Preset command"
        parent.handlePreset(device)
    } else if (position == 100) {
        log.info "position special value 100 is set, triggering Open command"
        open()
    } else {
        log.info "no-op for position value " + position + ", set position to 50 to trigger Preset command"
    }
}
