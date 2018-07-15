package com.epam.javaExternalLab.korostelevk.lesson05.task04.Demo;

import java.util.HashMap;
import java.util.Map;

import static com.epam.javaExternalLab.korostelevk.lesson05.task04.StringUtils.StringUtils.*;

public class DemoServiceImpl implements DemoService {

    @Override
    public void convertSentenceToWordsSequenceTests() {
        System.out.println("\nconvertSentenceToWordsSequence Tests");

        String text = "Ребе, Ви случайно не знаете, сколько  тогда Иуда получил по нынешнему курсу?";
        System.out.println("Source : " + text);
        System.out.println("\nConverted text:\n" + convertSentenceToWordsSequence(text));
    }

    @Override
    public void findMaxWordTests() {
        System.out.println("\nfindMaxWordTests");

        String text = "Большинство ошибок PORTAL.DLL связано с отсутствием или повреждениями файлов.";
        System.out.println("Source text:" + text);
        System.out.println("Max word is " + findMaxWord(convertSentenceToWordsSequence(text)));
    }

    @Override
    public void findMinWordTests() {
        System.out.println("\nfindMinWordTests");

        String text = "Файлы DLL, будучи общими, существуют за пределами самого приложения.";
        System.out.println("Source text:" + text);
        System.out.println("Min word is " + findMinWord(convertSentenceToWordsSequence(text)));
    }

    @Override
    public void removeIzhevskPrefixTests() {
        System.out.println("\nremoveIzhevskPrefix tests");
        String phones = "+7(3412)33322233 adssd +7 (3412) 234234 8 (3412)4435 a+7  (3412) 3452342 _+73412 " +
                "435358 +73412 4534345   83412 7553834123228  3412 4444";
        System.out.println("Source string: \n" + phones);
        System.out.println("Converted string \n" + removeIzhevskPrefix(phones));
    }

    @Override
    public void convertTemplateToTextTests() {
        System.out.println("\nconvertTemplateToText tests");

        String text = "Уважаемый, $userName, извещаем вас о том, что на вашем счете $номерСчета скопилась сумма, " +
                "превышающая стоимость $числоМесяцев месяцев пользования нашими услугами. Деньги продолжают " +
                "поступать. Вероятно, вы неправильно настроили автоплатеж. С уважением, $пользовательФИО " +
                "$должностьПользователя";

        Map<String, String> map = new HashMap<>();
        map.put("userName", "Иванов Иван Иванович");
        map.put("номерСчета", "12345655464645");
        map.put("числоМесяцев", "5");
        map.put("пользовательФИО", "Брусникина Галина Захаровна");
        map.put("должностьПользователя", "менеджер по работе с клиентами");

        System.out.println("Source text: \n" + text);
        System.out.println("Converted text:\n" + convertTemplateToText(text, map));
    }
}
