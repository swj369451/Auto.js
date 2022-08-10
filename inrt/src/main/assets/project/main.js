threads.start(function () {
    while(true){
        var beginBtn;
        if (beginBtn = classNameContains("Button").textContains("立即开始").findOne(2000)) {
            beginBtn.click();
        }
        var bluetoothBtn;
        if (bluetoothBtn = classNameContains("Button").textContains("配对").findOne(2000)) {
            bluetoothBtn.click();
        }
    }
});