# Contributing to the api-clients-automation repository

Welcome to the contributing guide for the api-clients-automation repository!

Please read [our contributing guides](https://api-clients-automation.netlify.app/docs/introduction/) for advanced usage.

If you can't find what you are looking for, please [open an issue](https://github.com/algolia/api-clients-automation/issues/new/choose).

## Reporting an issue

Opening an issue is very effective way to contribute because many users might also be impacted. We'll make sure to fix it quickly if it's technically feasible and doesn't have important side effects for other users.

Before reporting an issue, first check that there is not an already open issue for the same topic using the [issues page](https://github.com/algolia/api-clients-automation/issues). Don't hesitate to thumb up an issue that corresponds to the problem you have.

Another element that will help us go faster at solving the issue is to provide a reproducible test case.

## Code contribution

For any code contribution, you need to:

- Fork and clone the project
- Make your changes
- Open a pull request

## Commit conventions

This project follows the [conventional changelog](https://conventionalcommits.org/) approach. This means that all commit messages should be formatted using the following scheme:

```
type(scope): description
```

In most cases, we use the following types:

- `fix`: for any resolution of an issue (identified or not)
- `feat`: for any new feature
- `refactor`: for any code change that neither adds a feature nor fixes an issue
- `docs`: for any documentation change or addition
- `chore`: for anything that is not related to the library itself (doc, tooling)

Finally, if your work is based on an issue on GitHub, please add in the body of the commit message "fix #1234" if it solves the issue #1234 (read "[Closing issues using keywords](https://help.github.com/en/articles/closing-issues-using-keywords)").

Some examples of valid commit messages (used as first lines):

> - fix(javascript): ensure property X is valid
> - chore(deps): update dependency Y to v1.2.3
> - fix(specs): add missing property
> - docs(contributing): reword release section

## Requirements

To run this project, you will need:

- Node.js ≥ 20 – [nvm](https://github.com/creationix/nvm#install-script) is recommended
- [Yarn](https://yarnpkg.com)
- [Docker](https://docs.docker.com/desktop/install/mac-install/)
