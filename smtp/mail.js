// $npm i nodemailer
const nodemailer = require('nodemailer');

const main = async () => {
    let transporter = nodemailer.createTransport({
      service: 'naver',
      host: 'smtp.naver.com',
      port: 587,
      secure: false,
      auth: {
        // user: process.env.NODEMAILER_USER,
        // pass: process.env.NODEMAILER_PASS,
        user: 'yodikodi@naver.com',
        pass: 'password',        
      },
    });
  
    // send mail with defined transport object
    let info = await transporter.sendMail({
      from: `"육종곤" <yodikodi@naver.com>`,
      to: 'excelon@live.co.kr',
      subject: '테스트',
    //   text: generatedAuthNumber,
      html: `<b>하나둘셋넷<br/>다섯 여섯 </b>`,
    });
  
    console.log('Message sent: %s', info.messageId);
    // Message sent: <b658f8ca-6296-ccf4-8306-87d57a0b4321@example.com>
  

    // res.status(200).json({
    //   status: 'Success',
    //   code: 200,
    //   message: 'Sent Auth Email',
    // });
  };
  
  main().catch(console.error);
