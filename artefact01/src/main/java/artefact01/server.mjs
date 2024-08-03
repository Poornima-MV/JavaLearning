
const{ http }= require('./http');
const { createRequire } =  require('./module');
const { exec } = require('child_process');




function loadScript() {
	
	var yourscript = exec('YourScriptName.sh',
		(error, stdout, stderr) => {
			console.log(stdout);
			console.log(stderr);
			if (error !== null) {
				console.log(`exec error: ${error}`);
			}
		});
};