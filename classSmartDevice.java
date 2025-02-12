// SOLID - Interface Segregation Principle (ISP)
abstract class Phone {
    void makeCall();
}

abstract class EmailDevice {
    void sendEmail();
}

abstract class WebBrowser {
    void browseInternet();
}

abstract class Camera {
    void takePicture();
}

class SmartPhone implements Phone, EmailDevice, WebBrowser, Camera {
    @Override
    void makeCall() {
        print('Making a call');
    }
    
    @Override
    void sendEmail() {
        print('Sending an email');
    }
    
    @Override
    void browseInternet() {
        print('Browsing in internet');
    }
    
    @Override
    void takePicture() {
        print('Taking a picture');
    }

}

class SmartWatch implements Phone {
    @Override
    void makeCall() {
        print('Making a call');
    }
}