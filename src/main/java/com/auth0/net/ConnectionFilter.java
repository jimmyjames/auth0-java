package com.auth0.net;

public class ConnectionFilter extends BaseFilter<ConnectionFilter> {

    /**
     * Filter by strategy
     *
     * @param strategy only retrieve items with this strategy.
     * @return this filter instance
     */
    public ConnectionFilter withStrategy(String strategy) {
        parameters.put("strategy", strategy);
        return this;
    }

    /**
     * Filter by name
     *
     * @param name only retrieve the item with this name.
     * @return this filter instance
     */
    public ConnectionFilter withName(String name) {
        parameters.put("name", name);
        return this;
    }

    /**
     * Filter by page
     *
     * @param pageNumber    the page number to retrieve.
     * @param amountPerPage the amount of items per page to retrieve.
     * @return this filter instance
     */
    public ConnectionFilter withPage(int pageNumber, int amountPerPage) {
        parameters.put("page", pageNumber);
        parameters.put("per_page", amountPerPage);
        return this;
    }

}
