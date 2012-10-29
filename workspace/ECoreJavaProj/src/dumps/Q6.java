Given:
• d is a valid, non-null Date object
• df is a valid, non-null DateFormat object set to the
current locale
What outputs the current locales country name and the appropriate
version of d’s date?
A. Locale loc = Locale.getLocale();
System.out.println(loc.getDisplayCountry()
+ “ “+ df.format(d));
B. Locale loc = Locale.getDefault();
System.out.println(loc.getDisplayCountry()
+ “ “ + df.format(d));
C. Locale bc = Locale.getLocale();
System.out.println(loc.getDisplayCountry()
+ “ “+ df.setDateFormat(d));
D. Locale loc = Locale.getDefault();
System.out.println(loc.getDispbayCountry()
+ “ “+ df.setDateFormat(d));
Answer: B