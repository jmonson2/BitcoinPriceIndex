# Bitcoin Price Index
REST API to gather bitcoin prices

Build with the included gradle utility.
`./gradlew clean install`

Run with `./gradlew bootRun`

This API is using the free <a href=https://www.coindesk.com/coindesk-api>Coindesk API</a> to fetch bitcoin rates for USD, EUR, and GBP. It also uses <a href=https://exchangeratesapi.io/>Exchange Rates API</a> to fetch fiat exchange values to 
get calculate rates for many other currencies!

Current Endpoints: 
<table>
  <tr>
    <td>
      /bitcoin
    </td>
    <td>
      All Supported Currencies
    </td>
  </tr>
  <tr>
    <td>
      /bitcoin/{CURRENCY_CODE}
    </td>
    <td>
      Specific Currency
    </td>
  </tr>
</table>
