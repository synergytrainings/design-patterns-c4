function Factory() {
	this.createDevice = function (brandName) {
		var device;

        if (brandName === 'samsung') {
            device = new Samsung();
        } else if (brandName === 'iPhone') {
            device = new IPhone();
		} else if (brandName === 'nokia') {
            device = new Nokia();
		}

		device.brandName = brandName;

        device.discover = function () {
			console.log(this.brandName + ' works on ' + this.system + ' OS');
        };

        return device;
    };

    var Samsung = function () {
		this.system = 'android';
    };

	var IPhone = function () {
		this.system = 'ios';
    };

	var Nokia = function () {
		this.system = 'windows';
    };
}

function runMethods() {
	var devices = [];
    var factory = new Factory();

    devices.push(factory.createDevice("samsung"));
    devices.push(factory.createDevice("iPhone"));
    devices.push(factory.createDevice("nokia"));

    for(var i = 0; i < devices.length; i++){
    	devices[i].discover();
	}
}

runMethods();